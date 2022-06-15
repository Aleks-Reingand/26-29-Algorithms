package homework.tower_of_hanoi;

import java.util.Stack;

public class IterativeWay {
    public static void main(String[] args) {

        // Stack source, helper, destination
        // helperCreateSourceTower: countOfDisk
        // towerOfHanoiIterative: countOfDisk, source, helper, destination
        // helperMoveDiskBetweenTwoPoles: stack source, stack destination
        // printMove: pole source, pole destination, disk

        int countOfDisk = 3;
        Stack<Integer> sourceStack = new Stack();
        Stack<Integer> helperStack = new Stack();
        Stack<Integer> destinationStack = new Stack();

        createSourceTower(countOfDisk, sourceStack);
        towerOfHanoiIterative(countOfDisk, sourceStack, helperStack, destinationStack);
    }

    private static void createSourceTower(int countOfDisk, Stack<Integer> source) {
        for (int i = countOfDisk; i >= 1; i--) {
            source.push(i);
        }
    }

    private static void towerOfHanoiIterative(int countOfDisk, Stack<Integer> sourceStack, Stack<Integer> helperStack,
                                              Stack<Integer> destinationStack) {

        int moves = (int) (Math.pow(2, countOfDisk)) - 1;
        String source = "source";
        String helper = "helper";
        String destination = "destination";

        for (int i = 1; i <= moves; i++) {
            if (i % 3 == 1) { // source to destination 4%3=3+1
                helperMoveDiskBetweenTwoPoles(sourceStack, destinationStack, source, destination);
            } else if (i % 3 == 2) { // source to helper
                helperMoveDiskBetweenTwoPoles(sourceStack, helperStack, source, helper);
            } else if (i % 3 == 0) { // destination to helper
                helperMoveDiskBetweenTwoPoles(helperStack, destinationStack, helper, destination);
            }
        }

    }

    private static void helperMoveDiskBetweenTwoPoles(Stack pole, Stack destination, String poleSrc, String poleDest) {
        int sourceTopDisk = pole.empty() ? 0 : (int) pole.pop();
        int destinationTopDisk = destination.empty() ? 0 : (int) destination.pop();

        if (sourceTopDisk == 0) { // переместить диск c 'helper' на 'source'
            pole.push(destinationTopDisk);
            printMove(destinationTopDisk, poleDest, poleSrc);
        } else if (destinationTopDisk == 0) { // переместить диск с 'source' на 'destination'
            destination.push(sourceTopDisk);
            printMove(sourceTopDisk, poleSrc, poleDest);
        } else if (sourceTopDisk > destinationTopDisk) { // переместить диск с 'helper' на 'destination'
            pole.push(sourceTopDisk);
            pole.push(destinationTopDisk);
            printMove(destinationTopDisk, poleDest, poleSrc);
        } else if (sourceTopDisk < destinationTopDisk) { /// переместить диск с 'helper' на 'destination'
            destination.push(destinationTopDisk);
            destination.push(sourceTopDisk);
            printMove(sourceTopDisk, poleSrc, poleDest);
        }
    }

    private static void printMove(int disk, String src, String dest) {
        System.out.println("Move the disk " + disk + " from " + src + " to " + dest);
    }
}
