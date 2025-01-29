package currencyConverter;

    class currencies {

    String currency1, currency2;
    int amount;
    boolean valid;
    currencies(String currency1, String currency2 , int amount){
        this.currency1 = currency1;
        this.currency2 = currency2;
        this.amount = amount;
    }
    
   double converter(){
            //php to usd
            if(currency1.equalsIgnoreCase("PHP") && currency2.equalsIgnoreCase("USD")){
             return amount * 0.017125026;
             //usd to php
            }else if (currency1.equalsIgnoreCase("USD") && currency2.equalsIgnoreCase("PHP")){
            return amount * 58.3941;
            //php to jyp
            }else if (currency1.equalsIgnoreCase("PHP") && currency2.equalsIgnoreCase("JPY")){
            return amount * 2.6608268;
            //jyp to php
            }else if (currency1.equalsIgnoreCase("JPY") && currency2.equalsIgnoreCase("PHP")){
            return amount * 0.375823;
            //php to eur
            }else if (currency1.equalsIgnoreCase("PHP") && currency2.equalsIgnoreCase("EUR")){
            return amount * 0.016456699;
            //eur to php
            }else if (currency1.equalsIgnoreCase("EUR") && currency2.equalsIgnoreCase("PHP")){
            return amount * 60.7690;
            //php to gbp
            }else if (currency1.equalsIgnoreCase("PHP") && currency2.equalsIgnoreCase("GBP")){
            return amount * 0.013790027;
            //gbp to php
            }else if (currency1.equalsIgnoreCase("GBP") && currency2.equalsIgnoreCase("PHP")){
            return amount * 72.5162;
            //php to cny
            }else if (currency1.equalsIgnoreCase("PHP") && currency2.equalsIgnoreCase("CNY")){
            return amount * 0.12406539;
            //cny to php
            }else if (currency1.equalsIgnoreCase("CNY") && currency2.equalsIgnoreCase("PHP")){
            return amount * 8.06027;
            }else return -1;
        }
    

   }
    
