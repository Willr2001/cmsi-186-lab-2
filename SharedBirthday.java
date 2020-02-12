public class SharedBirthday {

    public static void main(String[] args) {
        try {
            if (args.length != 3) {
                throw new IllegalArgumentException("Exactly three arguments required");
            }
            int people = Integer.parseInt(args[0]);
            int days = Integer.parseInt(args[1]);
            int trials = Integer.parseInt(args[2]);
            System.out.println(probabilityEstimate(people, days, trials));


        } catch (NumberFormatException e) {
            System.err.println("Arguments must all be integers");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    public static double probabilityEstimate(int people, int days, int trials) {
      if (people < 2) {
        throw new IllegalArgumentException("At least two poeple required");
      }

      if (days < 1) {
        throw new IllegalArgumentException("At least one day required");
      }

      if (trials < 1) {
        throw new IllegalArgumentException("At least one trial required");
      }

      for (int t = 0; t < trials; t++) {

        boolean[] hasBirthday = new boolean[days];

        while (true) {
          people++;
          int d = (int) (days * Math.random());
          if (hasBirthday[d]) break;
          hasBirthday[d] = true;
        }

      }

      return (double) people / trials;
      //System.out.println("Average = "+ average);

    }


    //
    // TODO: Don't be afraid to write private helper methods to keep your code modular.
    //
}
