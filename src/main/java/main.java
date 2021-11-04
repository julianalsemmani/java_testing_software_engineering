public class main {
    public static boolean checkLeapYear(int year) {
        //if (year % 4 == 0) {
            //if (year % 100 != 0) {
                //if (year % 400 == 0) {
                  //  return true;
                //} else {
                //    return false;
              //  }
            //} else {
            //    return false;
          //  }
        //} else {
          //  return false;
        //}
        // The algorithm I wrote gave the wrong results, so I had to find one on the internet. Source below.

        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

        /*
        * This algorithm is retrieved from:
        * https://www.tutorialspoint.com/Java-program-to-find-if-the-given-number-is-a-leap-year
        */
    }
}
