package ro.siit.BubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        SalesRepresentative alexandra = new SalesRepresentative(5, 900);
        SalesRepresentative elena = new SalesRepresentative(7, 300);
        SalesRepresentative rares = new SalesRepresentative(11, 800);
        SalesRepresentative andrei = new SalesRepresentative(8, 500);
        SalesRepresentative radu = new SalesRepresentative(5, 700);
        SalesRepresentative marius = new SalesRepresentative(15, 700);
        SalesRepresentative vasile = new SalesRepresentative(6, 900);
        SalesRepresentative sandi = new SalesRepresentative(9, 400);
        SalesRepresentative teodor = new SalesRepresentative(7, 800);
        SalesRepresentative maria = new SalesRepresentative(10, 700);
        SalesRepresentative[] reps = new SalesRepresentative[10];
        reps[0] = alexandra;
        reps[1] = elena;
        reps[2] = rares;
        reps[3] = andrei;
        reps[4] = radu;
        reps[5] = marius;
        reps[6] = vasile;
        reps[7] = sandi;
        reps[8] = teodor;
        reps[9] = maria;
        System.out.println(sort(reps));
    }

    /**
     * Function which sorts the revenues of the people from SalesRepresentative in descending order
     *
     * @param reps is the person from SalesRepresentative class
     * @return the revenue
     */
    public static SalesRepresentative sort(SalesRepresentative[ ] reps) {
        SalesRepresentative smallest = reps[0];
        for (int i = 0; i <reps.length; i++) {
            for (int j = 1; j < reps.length; j++) {
                if (reps[j-1].computeRevenue() > reps[j].computeRevenue()) {
                    smallest = reps[j-1];
                    reps[j-1] = reps[j];
                    reps[j] = smallest;
                    }
            }
        }
        for (int i = 0; i < reps.length; i++) {
            System.out.println(reps[reps.length - i - 1].computeRevenue());
        }
        return null;
    }
}





