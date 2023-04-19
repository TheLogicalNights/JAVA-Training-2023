package calculator;

public class Math {
    public int addTwoNumbers(int iNo1, int iNo2) {
        return iNo1 + iNo2;
    }

    public int subtractTwoNumbers(int iNo1, int iNo2) {
        return iNo1 - iNo2;
    }

    public int multiplyTwoNumbers(int iNo1, int iNo2) {
        return iNo1 * iNo2;
    }

    public int divideTwoNumbers(int iNo1, int iNo2) {
        int iDivision = -1;
        if (iNo2 != 0) {
            iDivision = iNo1 / iNo2;
        }
        return iDivision;
    }

    public int moduloOfTwoNumbers(int iNo1, int iNo2) {
        int iDivision = -1;
        if (iNo2 != 0) {
            iDivision = iNo1 % iNo2;
        }
        return iDivision;
    }

    public int squareOfNumber(int iNo) {
        return iNo * iNo;
    }

    public int cubeOfNumber(int iNo) {
        return iNo * iNo * iNo;
    }
}
