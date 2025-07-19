class forecaste{
    public static void main(String[] args){
        double initialAmount=1000.0;
        double growthrate=0.10;
        int years=5;
        double ans=amountCalculation(initialAmount,growthrate,years);
        System.out.print(ans);
    }
    public static double amountCalculation(double amount,double growthrate,int years){
        if(years==0){
            return amount;
        }
        return amountCalculation(amount*(1+growthrate/100), growthrate, years-1);
    }
}