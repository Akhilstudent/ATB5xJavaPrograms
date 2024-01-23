package oops_20th_jan;

public class Bank {
    private Integer amount;
    private String currency;

    public Bank(Integer amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer add(Bank bankName) throws CustomException    {
        if (!(bankName.currency.equalsIgnoreCase("INR"))){
            throw new CustomException("USD to INR is not Supported");
        }

        Integer sum = this.amount + bankName.amount;
        return sum;
    }



}
