package edu.ithaca.agable;

import static java.lang.Character.isDigit;

public class stringCalculatorImpl implements stringCalculator{

    public int Add(String numbers){
        if(numbers == ""){
            return 0;
        }
        if(!numbers.contains(",")){
            //single values
            if(!numbers.contains("-")){
                //positive
                boolean isDigit = true;
                for(int i = 0; i < numbers.length(); i++){
                    if(!isDigit(numbers.charAt(i))){
                        isDigit = false;
                    }
                }
                if(isDigit){
                    return Integer.parseInt(numbers);
                }
            }else{
                //negative
                boolean isDigit = true;
                for(int i = 1; i < numbers.length(); i++){
                    if(!isDigit(numbers.charAt(i))){
                        isDigit = false;
                    }
                }
                if(isDigit && numbers.charAt(0)=='-'){
                    return Integer.parseInt(numbers);
                }
            }
        }
        return -1;
    }
}
