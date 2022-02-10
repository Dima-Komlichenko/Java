package Homeworks.HW6;

import java.util.Arrays;

public class Program6 {
    public static void main(String[] args) {
        //1
        //int year = 2000;

        ILeapYear leapYear = y -> y % 4 == 0;
        //System.out.println(leapYear.isLeapYear(year));



        //2
        String date1 = "01.01.2022";
        String date2 = "10.01.2022";

        IDaysBetweenTwoDates daysBetweenTwoDates = (d1, d2) -> {
            String[] strDate1 = d1.split(".");
            String[] strDate2 = d2.split(".");

            int[] arrDate1 = new int[3];
            int[] arrDate2 = new int[3];

            for (int i = 0; i < arrDate1.length; i++) {
                arrDate1[i] = Integer.parseInt(strDate1[i]);
                arrDate2[i] = Integer.parseInt(strDate2[i]);
            }


            int differenceYear = Math.abs(arrDate1[2] - arrDate2[2]);
            int differenceMonth = Math.abs(arrDate1[1] - arrDate2[1]);
            int differenceDays = Math.abs(arrDate1[0] - arrDate2[0]);

            differenceDays += differenceYear * 365;
            differenceDays += differenceMonth * 30;

            return differenceDays;
        };

        System.out.println(daysBetweenTwoDates.countDaysBetweenTwoDates(date1, date2));



        //3
        IWeeksBetweenTwoDates weeksBetweenTwoDates = (d1, d2) -> {
            String[] strDate1 = d1.split(".");
            String[] strDate2 = d2.split(".");

            int[] arrDate1 = new int[3];
            int[] arrDate2 = new int[3];

            for (int i = 0; i < arrDate1.length; i++) {
                arrDate1[i] = Integer.parseInt(strDate1[i]);
                arrDate2[i] = Integer.parseInt(strDate2[i]);
            }

            int differenceYear = Math.abs(arrDate1[2] - arrDate2[2]);
            int differenceMonth = Math.abs(arrDate1[1] - arrDate2[1]);

            int differenceWeeks = differenceYear * 48;
            differenceWeeks += differenceMonth * 4;

            return differenceWeeks;
        };

        System.out.println(weeksBetweenTwoDates.countWeeksBetweenTwoDates(date1, date2));



        //4
        IDayOfWeek dayOfWeek = d -> {
            String[] strDate = d.split(".");

            String year = strDate[2];
            int twoLastYearNumbers = Integer.parseInt(year.substring(year.length()-2));
            int yearCode = (6 + twoLastYearNumbers + twoLastYearNumbers / 4) % 7;

            int month = Integer.parseInt(strDate[1]);
            int monthCode = switch (month) {
                case 1, 10 -> 1;
                case 5 -> 2;
                case 8 -> 3;
                case 2, 3, 11 -> 4;
                case 6 -> 5;
                case 12, 9 -> 6;
                case 4, 7 -> 0;
                default -> throw new IllegalStateException("Unexpected value: " + month);
            };

            int day = Integer.parseInt(strDate[0]);

            return (day + monthCode + yearCode) % 7;
        };

        System.out.println(dayOfWeek.countDayOfWeek(date1));



        //5
        Fraction fraction1 = new Fraction(3,5);
        Fraction fraction2 = new Fraction(4,8);
        IMathFractions sumTwoFraction = (f1, f2) -> {
            int nod = Math.max(f1.getDenominator(), f2.getDenominator());
            do {
                nod++;
            }while (nod / f1.getDenominator() % 2 != 0 || nod / f2.getDenominator() % 2 != 0);

            int factor1 = nod / f1.getDenominator();
            int factor2 = nod / f2.getDenominator();

            Fraction newF1 = new Fraction(fraction1.getNumerator() * factor1, fraction1.getDenominator() * factor2);
            Fraction newF2 = new Fraction(fraction2.getNumerator() * factor1, fraction2.getDenominator() * factor2);

            return new Fraction(newF1.getNumerator() + newF2.getNumerator(), newF1.getDenominator());
        };
        System.out.println(sumTwoFraction.calculate(fraction1, fraction2));


        IMathFractions differenceTwoFraction = (f1, f2) -> {
            int nod = Math.max(f1.getDenominator(), f2.getDenominator());
            do {
                nod++;
            }while (nod / f1.getDenominator() % 2 != 0 || nod / f2.getDenominator() % 2 != 0);

            int factor1 = nod / f1.getDenominator();
            int factor2 = nod / f2.getDenominator();

            Fraction newF1 = new Fraction(fraction1.getNumerator() * factor1, fraction1.getDenominator() * factor2);
            Fraction newF2 = new Fraction(fraction2.getNumerator() * factor1, fraction2.getDenominator() * factor2);

            return new Fraction(newF1.getNumerator() - newF2.getNumerator(), newF1.getDenominator());
        };
        System.out.println(differenceTwoFraction.calculate(fraction1, fraction2));


        IMathFractions multiplyTwoFraction = (f1, f2) -> {
            return new Fraction(f1.getNumerator() * f2.getNumerator(), f1.getDenominator() * f2.getDenominator());
        };
        System.out.println(multiplyTwoFraction.calculate(fraction1, fraction2));


        IMathFractions devisionTwoFraction = (f1, f2) -> {
            return new Fraction(f1.getNumerator() * f2.getDenominator(), f2.getNumerator() * f1.getDenominator());
        };
        System.out.println(devisionTwoFraction.calculate(fraction1, fraction2));



        //6

    }

    public interface ILeapYear {
        public boolean isLeapYear(int year);

    }

    public interface IDaysBetweenTwoDates {
        public int countDaysBetweenTwoDates(String date1, String date2);
    }

    public interface IWeeksBetweenTwoDates {
        public int countWeeksBetweenTwoDates(String date1, String date2);
    }

    public interface IDayOfWeek{
        public int countDayOfWeek(String date);
    }

    public interface IMathFractions {
        public Fraction calculate(Fraction fraction1, Fraction fraction2);
    }


}
