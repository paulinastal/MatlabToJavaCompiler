//Program napisany w JAVA
public class Program {
    public static void main(String[] args) {
        Integer zmienna1 = 4;
        Double zmienna2 = 5.6;
        Boolean zmienna3 = true;
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<ArrayList<Integer>> b = new ArrayList<>();
        b.add(new ArrayList<>(Arrays.asList(1, 3, 5)));
        b.add(new ArrayList<>(Arrays.asList(2, 4, 6)));
        b.add(new ArrayList<>(Arrays.asList(7, 8, 10)));
        ArrayList<Double> c = new ArrayList<>(Arrays.asList(3.5, 11.3, 88.3));
        ArrayList<Boolean> d = new ArrayList<>(Arrays.asList(true, false, false, true, false));
        Object z = zeros(5, 1);

        switch (n) {
            case 1:
                a = 3;
                break;
            case 0:
                a = 2.0;
                break;
            default:
                a = 3;
                break;
        }

        if (x>0)x>0 && (y>0) {
            Integer y = 3;
        } else if (x<=0)x<=0 || (y<0) {
            y = 66;
        } else  {
            y = 222.99;
        }

        if (x==3) {
            y = 5;
        } else if (x==2) {
            y = 7;
        } else  {
            y = 3;
        }

        if (m>=4) {
            Integer k = 0;
        }

        while (x>3) {
            y = 2;
        }

        while (t<=4) {
            d = 11;
        }

        while (x>0)x>0 && (y>0) {
            Integer ff = 22;
            y = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        }

        for (int c = 1; c < 3; c++) {
            y = 22;
            ArrayList<Integer> zmienna = new ArrayList<>(Arrays.asList(1, 2, 34, 6));
        }

        ArrayList<Integer> y = new ArrayList<>(Arrays.asList(2, 3, 4));
        for (Integer yElement : y) {
            y = 22;
        }

        ArrayList<Double> z = new ArrayList<>(Arrays.asList(22.3, 67.3));
        for (Double zElement : z) {
            Integer t = 2;
        }
        k = 4 + 6;
        Integer m = 4 * j;
        a = addArrays(new ArrayList<>(Arrays.asList(1, 2, 3, 3)), new ArrayList<>(Arrays.asList(5, 6, 7)));
        b = elementWiseMultiplyArrays(new ArrayList<>(Arrays.asList(5.4, 4.5, 6.3)), new ArrayList<>(Arrays.asList(1, 2, 3)));
        c = (1 - 6) * 2 - (Math.pow(3, 2));
    }
}
