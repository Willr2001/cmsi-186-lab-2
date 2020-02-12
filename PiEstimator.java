public class PiEstimator {

    public static void main(String[] args) {
        System.out.println("ARGS LENGTH: " + args.length);
        try {
            if (args.length != 1) {
                throw new Exception("Exactly one argument required");
                // System.err.println("Exactly one argument required");

            }
            int darts = Integer.parseInt(args[0]);
            System.out.println(estimate(darts));

        } catch (NumberFormatException e) {
            System.err.println("Argument must be an integer");

        } catch (IllegalArgumentException e) {
            // System.err.println("At least one dart required");
            System.err.println("Exactly one argument required");

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static double estimate(int darts) {
        double pi = 0.0;

        if(darts < 1){
          throw new IllegalArgumentException("At least one dart required");
        }else{

          int inside = 0;
          for(var i = 0; i < darts; i++){
              if(Math.hypot(Math.random(),Math.random()) <= 1){
                inside+= 1;
              }
          }
          pi = 4 * ((double)inside/(double)darts);
        }
        return pi;
    }

}
