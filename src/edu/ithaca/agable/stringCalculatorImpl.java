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
        else {
            int totalNum = 0;

            int numNumbers = 1;
            for (int j = 0; j < numbers.length(); j++) {
                if (numbers.charAt(j) == ',') {
                    numNumbers++;
                }
            }

            int startIndex = 0;
            for (int j = 0; j < numNumbers-1; j++) {
                for (int i = 0; i < numbers.length(); i++) {
                    if (numbers.charAt(i) == ',') {
                        startIndex = i;
                    }
                }

                String potentialNum = numbers.substring(startIndex+1);
                numbers = numbers.substring(0, startIndex);

                if(!potentialNum.contains("-")){
                    //positive
                    boolean isDigit = true;
                    for(int i = 0; i < potentialNum.length(); i++){
                        if(!isDigit(potentialNum.charAt(i))){
                            isDigit = false;
                        }
                    }
                    if(isDigit){
                        totalNum+= Integer.parseInt(potentialNum);
                    }
                }else{
                    //negative
                    boolean isDigit = true;
                    for(int i = 1; i < potentialNum.length(); i++){
                        if(!isDigit(potentialNum.charAt(i))){
                            isDigit = false;
                        }
                    }
                    if(isDigit && potentialNum.charAt(0)=='-'){
                        totalNum += Integer.parseInt(potentialNum);
                    }
                }
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
                        totalNum+= Integer.parseInt(numbers);
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
                        totalNum += Integer.parseInt(numbers);
                    }
                }
            }
            return totalNum;
        }
        return -1;
    }
}
