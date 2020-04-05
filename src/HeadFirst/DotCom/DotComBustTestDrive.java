package HeadFirst.DotCom;

import java.util.ArrayList;

public class DotComBustTestDrive {

    public static void main (String[] args) {

        DotComTestDrive shipOne = new DotComTestDrive();
        DotComTestDrive shipTwo = new DotComTestDrive();
        DotComTestDrive shipThree = new DotComTestDrive();

        int error = shipOne.error() + shipTwo.error() + shipThree.error();

        if (error > 0) {
            System.out.println("DotComBust Test: failed" );
        } else {
            System.out.println("DotComBust Test: passed" );
        }
    }
}
