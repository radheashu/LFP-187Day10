package com.briegdlab;

public class EmployeeWage {

        //Constants
        public final int IS_PART_TIME = 1;
        public final int IS_FULL_TIME = 2;
        public final int WAGE_PER_HOUR = 20;
        public static final int NUM_WORKING_DAYS = 20;
        public static final int MAX_HOUR_IN_MONTH = 100;

        //Variable for Calculating Employee Wage
        int empWage = 0;
        int empHrs = 0;
        int totalEmpWage = 0;
        static int totalEmpHrs = 0;
        static int totalWorkingDays = 0;

        //Method to Check Employee Type and Hours of Work
        private void getEmployeeType() {
            //Computation of Employee Type
            double empCheck = Math.floor(Math.random() * 10) % 3;

            switch ((int) empCheck) {
                case IS_PART_TIME:
                    System.out.println("Employee is Present as PART TIME");
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    System.out.println("Employee is Present as FULL TIME");
                    empHrs = 8;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    empHrs = 0;
                    break;
            }
        }

        //Method to Calculate Employee Wage by Hours and Type
        private void calculateEmpWage() {
            totalEmpHrs += empHrs;      //Calculating Total Hours
            empWage = WAGE_PER_HOUR * empHrs;   // Calculating Employee Wage if Employee is Present as PART TIME Or FULL TIME
            totalEmpWage = empWage + totalEmpWage;
            System.out.println("Employee Wage = " + empWage);
            System.out.println("Days:"+totalWorkingDays+"\tTotal Hours:"+totalEmpHrs);
        }

        public static void main(String[] args) {

            //Welcome Message for Initial Purpose
            System.out.println("Welcome to Employee Wages Problem using opps");

            EmployeeWage EW = new EmployeeWage();

            while( totalEmpHrs <= MAX_HOUR_IN_MONTH && totalWorkingDays < NUM_WORKING_DAYS) {
                totalWorkingDays++;     //Incrementing Working Days
                //Calling Employee Type and Wage Methods by Using Object of Employee Wage Class
                EW.getEmployeeType();
                EW.calculateEmpWage();
            }

            //Displaying Total Emp Wages
            System.out.println("Total Employee Wages = "+ EW.totalEmpWage);
        }
    }


