import java.util.ArrayList;

//Some of this was done at home a month or so ago
public class PalindromeFinder {
        //private static String[] palindromeArray = {}
        private static ArrayList<String> palindromeList = new ArrayList<String>();
        private static ArrayList<String> superPalindromeList = new ArrayList<String>();

        public static String findPalindromes(int iterations) {
            int next = 0;
            String strNext;
            int dig = 0;
            int dig2 = 0;
            int dig3 = 0;
            for (int j = 0; j < iterations; j++) {
                strNext = next + "";
                if (String.valueOf(next).length() == 1) {
                    if (String.valueOf(next + 1).length() != 1) {
                        next += 2;
                    }
                    else {
                        next++;
                    }
                }
                else if (String.valueOf(next).length() == 2) {
                    if (String.valueOf(next + 1).length() != 2) {
                        next += 2;
                        strNext = next + "";
                        dig = Integer.valueOf(strNext.substring(0,1));
                        System.out.println("DIG IS " + dig + ", NUM IS " + next);
                        System.out.println(strNext.substring(0,1));
                        System.out.println("Strnext is " + strNext);
                    }
                    else {
                        next += 11;
                    }
                }
                else if (String.valueOf(next).length() == 3) {
                    if (String.valueOf(next + 9).length() != 3) {
                        next += 2;
                        strNext = next + "";
                        dig = Integer.valueOf(strNext.substring(0,1));
                        System.out.println("DIG IS " + dig + ", NUM IS " + next);
                    }
                    else if (!(next + 9 + "").substring(0, 1).equals(dig + "")) {
                        next += 11;
                        strNext = next + "";
                        dig = Integer.valueOf(strNext.substring(0,1));
                    }
                    else {
                        next += 10;
                    }
                }
                else if (String.valueOf(next).length() == 4) {
                    if (String.valueOf(next + 1).length() != 4) {
                        next += 2;
                        strNext = next + "";
                        dig = Integer.valueOf(strNext.substring(0,1));
                    }
                    else if (!(next + 100 + "").substring(0,1).equals(dig + "")) {
                        next += 11;
                        strNext = next + "";
                        dig = Integer.valueOf(strNext.substring(0,1));
                    }
                    else {
                        next += 110;
                    }
                }
                else if (String.valueOf(next).length() == 5) {
                    if (String.valueOf(next + 1).length() != 5) {
                        next += 2;
                        strNext = next + "";
                        dig = Integer.valueOf(strNext.substring(0,1));
                        dig2 = Integer.valueOf(strNext.substring(1,2));
                    }
                    else if (!(next + 100 + "").substring(1,2).equals(dig2 + "") && (next + 100 + "").substring(0,1).equals(dig + "")) {
                        next += 110;
                        strNext = next + "";
                        dig2 = Integer.valueOf(strNext.substring(1,2));
                    }
                    else if (!(next + 100 + "").substring(0,1).equals(dig + "")) {
                        next += 11;
                        strNext = next + "";
                        dig = Integer.valueOf(strNext.substring(0,1));
                        dig2 = Integer.valueOf(strNext.substring(1,2));
                    }
                    else {
                        next += 100;
                    }
                }
                else if (String.valueOf(next).length() == 6) {
                    if (String.valueOf(next + 1).length() != 6) {
                        next += 2;
                        strNext = next + "";
                        dig = Integer.valueOf(strNext.substring(0,1));
                        dig2 = Integer.valueOf(strNext.substring(1,2));
                        dig3 = Integer.valueOf(strNext.substring(2,3));
                    }
                    else if (!(next + 1100 + "").substring(1,2).equals(dig2 + "") && (next + 1100 + "").substring(0,1).equals(dig + "")) {
                        next += 110;
                        strNext = next + "";
                        dig2 = Integer.valueOf(strNext.substring(1,2));
                    }
                    else if (!(next + 1100 + "").substring(0,1).equals(dig + "")) {
                        next += 11;
                        strNext = next + "";
                        dig = Integer.valueOf(strNext.substring(0,1));
                        dig2 = Integer.valueOf(strNext.substring(1,2));
                    }
                    else {
                        next += 1100;
                    }
                }
                else if (String.valueOf(next).length() == 7) {
                    if (String.valueOf(next + 1).length() != 7) {
                        next += 2;
                        strNext = next + "";
                        dig = Integer.valueOf(strNext.substring(0,1));
                        dig2 = Integer.valueOf(strNext.substring(1,2));
                        dig3 = Integer.valueOf(strNext.substring(2,3));
                    }
                    else if (!(next + 1100 + "").substring(2,3).equals(dig3 + "") && (next + 1100 + "").substring(1,2).equals(dig2 + "") && (next + 1100 + "").substring(0,1).equals(dig + "")) {
                        next += 1100;
                        strNext = next + "";
                        dig = Integer.valueOf(strNext.substring(0,1)); //Maybe don't need all of these changes?
                        dig2 = Integer.valueOf(strNext.substring(1,2));
                        dig3 = Integer.valueOf(strNext.substring(2,3));
                    }
                    else if (!(next + 11 + "").substring(2,3).equals(dig3 + "") && !(next + 11 + "").substring(1,2).equals(dig2 + "") && (next + 11 + "").substring(0,1).equals(dig + "")) { //try removing nots next time
                        next += 11;
                        strNext = next + "";
                        dig = Integer.valueOf(strNext.substring(0,1)); //Maybe don't need all of these changes?
                        dig2 = Integer.valueOf(strNext.substring(1,2));
                        dig3 = Integer.valueOf(strNext.substring(2,3));
                    }
                    else if (!(next + 1000 + "").substring(0,1).equals(dig + "")) {
                        next += 11;
                        strNext = next + "";
                        dig = Integer.valueOf(strNext.substring(0,1));
                        dig2 = Integer.valueOf(strNext.substring(1,2));
                        dig3 = Integer.valueOf(strNext.substring(2,3));
                    }
                    else {
                        next += 1000;
                    }
                }
                palindromeList.add(next + "");

            }
            return palindromeList.toString();
        }


        public static String findSuperPalindromes() {
            for (int i = 0; i < palindromeList.size(); i++) {
                int intSquared = Integer.parseInt(palindromeList.get(i)) * Integer.parseInt(palindromeList.get(i));
                String squared = intSquared + "";
                String backward = "";
                for (int j = String.valueOf(squared).length() - 1; j >= 0; j--) {
                    backward += squared.substring(j, j + 1);
                }
                if (backward.equals(squared)) {
                    superPalindromeList.add(backward);
                }
            }
            return superPalindromeList.toString();
        }

        public static void main (String[]args){
            System.out.println(findPalindromes(100000));

        }
}

