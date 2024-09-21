package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        System.out.println("Testing Clock Display:");
        ClockDisplay test1 = new ClockDisplay();
        String test1Output = test1.getTime();
        System.out.println("\tEmpty Con. Test - " + test1Output); 
        
        ClockDisplay test2 = new ClockDisplay (2,45);
        String test2Output = test2.getTime();
        System.out.println("\t2 Arg Con. Test - " + test2Output);
        
        test2.setTime(5, 15);
        String test3Output = test2.getTime();
        System.out.println("\t3 Arg Con. Test - " + test3Output);
        
        //TODO: Read time and tick time tests
        
        ClockDisplay tickTest1 = new ClockDisplay(3, 32);
        String tickTest1Output = tickTest1.getTime();
        System.out.println("\tTickTest1 Before increment - " + tickTest1Output);
        tickTest1.timeTick();
        tickTest1Output = tickTest1.getTime();
        System.out.println("\tTickTest1 After increment - " + tickTest1Output);
        
        ClockDisplay tickTest2 = new ClockDisplay(3, 9);
        String tickTest2Output = tickTest2.getTime();
        System.out.println("\tTickTest2 Before increment - " + tickTest2Output);
        tickTest2.timeTick();
        tickTest2Output = tickTest2.getTime();
        System.out.println("\tTickTest2 After increment - " + tickTest2Output);
        
        ClockDisplay tickTest3 = new ClockDisplay(1, 59);
        String tickTest3Output = tickTest3.getTime();
        System.out.println("\tTickTest3 Before increment - " + tickTest3Output);
        tickTest3.timeTick();
        tickTest3Output = tickTest3.getTime();
        System.out.println("\tTickTest3 After increment - " + tickTest3Output);
        
        ClockDisplay tickTest4 = new ClockDisplay(9, 59);
        String tickTest4Output = tickTest4.getTime();
        System.out.println("\tTickTest4 Before increment - " + tickTest4Output);
        tickTest4.timeTick();
        tickTest4Output = tickTest4.getTime();
        System.out.println("\tTickTest4 After increment - " + tickTest4Output);
        
        ClockDisplay tickTest5 = new ClockDisplay(23, 59);
        String tickTest5Output = tickTest5.getTime();
        System.out.println("\tTickTest5 Before increment - " + tickTest5Output);
        tickTest5.timeTick();
        tickTest5Output = tickTest5.getTime();
        System.out.println("\tTickTest5 After increment - " + tickTest5Output);
    
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        ClockDisplaySeconds tickTest6 = new ClockDisplaySeconds(3, 32, 59);
        String tickTest6Output = tickTest6.getTime();
        System.out.println("\tTickTest6 Before increment - " + tickTest6Output);
        tickTest6.timeTick();
        tickTest6Output = tickTest6.getTime();
        System.out.println("\tTickTest6 After increment - " + tickTest6Output);
        
        ClockDisplaySeconds tickTest7 = new ClockDisplaySeconds(1, 00, 00);
        String tickTest7Output = tickTest7.getTime();
        System.out.println("\tTickTest7 Before increment - " + tickTest7Output);
        tickTest7.timeTick();
        tickTest7Output = tickTest7.getTime();
        System.out.println("\tTickTest7 After increment - " + tickTest7Output);
        
        ClockDisplaySeconds tickTest8 = new ClockDisplaySeconds(1, 59, 59);
        String tickTest8Output = tickTest8.getTime();
        System.out.println("\tTickTest8 Before increment - " + tickTest8Output);
        tickTest8.timeTick();
        tickTest8Output = tickTest8.getTime();
        System.out.println("\tTickTest8 After increment - " + tickTest8Output);
        
        ClockDisplaySeconds tickTest9 = new ClockDisplaySeconds(23, 59, 59);
        String tickTest9Output = tickTest9.getTime();
        System.out.println("\tTickTest9 Before increment - " + tickTest9Output);
        tickTest9.timeTick();
        tickTest9Output = tickTest9.getTime();
        System.out.println("\tTickTest9 After increment - " + tickTest9Output);
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
    }
}
//Output:
//Testing Clock Display:
//Empty Con. Test - 00:00
//2 Arg Con. Test - 02:45
//3 Arg Con. Test - 05:15
//TickTest1 Before increment - 03:32
//TickTest1 After increment - 03:33
//TickTest2 Before increment - 03:09
//TickTest2 After increment - 03:10
//TickTest3 Before increment - 01:59
//TickTest3 After increment - 02:00
//TickTest4 Before increment - 09:59
//TickTest4 After increment - 10:00
//TickTest5 Before increment - 23:59
//TickTest5 After increment - 00:00
//TickTest6 Before increment - 03:32:59
//TickTest6 After increment - 03:33:00
//TickTest7 Before increment - 01:00:00
//TickTest7 After increment - 01:00:01
//TickTest8 Before increment - 01:59:59
//TickTest8 After increment - 02:00:00
//TickTest9 Before increment - 23:59:59
//TickTest9 After increment - 00:00:00
