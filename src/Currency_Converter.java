public class Currency_Converter {
    public static void main(String[] args) {

         double num,rupee,dollar,pound,euro,KWD;
        DecimalFormat f= new DecimalFormat("##.###");
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Welcome to Currency Converter Project *** \n Enter the Currency you want to convert into ");
        num = sc.nextInt();
        if(num == 1){

            System.out.println("Enter the amount in Rupees : ");
            rupee = sc.nextDouble();
            dollar = rupee /84.08;
            System.out.println("Dollar :" +f.format(dollar));
            pound = rupee / 108.69;
            System.out.println("Pound : " +f.format(pound));
            euro = rupee/90.58;
            System.out.println("Euro : " +f.format(euro));
            KWD = rupee/0.0036;
            System.out.println(" Kuwaiti Dinar : " +f.format(KWD));

        }

        else if (num == 2){
            System.out.println("Enter the amount in dollar :");
            dollar = sc.nextDouble();
            rupee = dollar * 84.08;
            System.out.println("Rupee :" +f.format(rupee));
            pound = dollar * 0.77;
            System.out.println("Pound : " +f.format(pound));
            euro = dollar * 0.93;
            System.out.println("Euro : " +f.format(euro));
            KWD = dollar * 0.31;
            System.out.println(" Kuwaiti Dinar : " +f.format(KWD));

        }

        else if (num == 3){
            System.out.println("Enter the amount in pound :");
            pound = sc.nextDouble();
            dollar = pound * 1.29;
            System.out.println("Dollar :" +f.format(dollar));
            rupee = pound * 108.77;
            System.out.println("Rupee : " +f.format(rupee));
            euro = pound * 1.20;
            System.out.println("Euro : " +f.format(euro));
            KWD = pound * 0.40;
            System.out.println(" Kuwaiti Dinar : " +f.format(KWD));

        }

        else if (num == 4){
            System.out.println("Enter the amount in Euro :");
            euro = sc.nextDouble();
            dollar = euro * 1.08;
            System.out.println("Dollar :" +f.format(dollar));
            pound = euro * 0.83;
            System.out.println("Pound : " +f.format(pound));
            rupee = euro*  90.59;
            System.out.println("Rupee : " +f.format(rupee));
            KWD = euro * 0.33;
            System.out.println(" Kuwaiti Dinar : " +f.format(KWD));

        }

        else if (num == 5){
            System.out.println("Enter the amount in KWD (Kuwaiti Dinar) :");
            KWD = sc.nextDouble();
            dollar = KWD * 3.26;
            System.out.println("Dollar :" +f.format(dollar));
            pound = KWD * 2.52;
            System.out.println("Pound : " +f.format(pound));
            euro = KWD* 3.03;
            System.out.println("Euro : " +f.format(euro));
            rupee =KWD*274.27;
            System.out.println(" Rupees : " +f.format(rupee));

        }
    }
}
