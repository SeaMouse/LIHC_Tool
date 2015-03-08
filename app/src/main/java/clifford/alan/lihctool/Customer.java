package clifford.alan.lihctool;

/**
 * Created by Alan Clifford on 28/02/2015.
 */

public class Customer {

        public Integer threshold=15;

        public String name;
        public Double employmentStatus = 0.0;
        public Double partnerEmploymentStatus= 0.0;
        public Double meansTestedBenefits= 0.0;
        public Double disabilityBenefits= 0.0;
        public Double paymentMethod= 0.0;

        public Double propertyType = 0.0;
        public Double pre1964 = 0.0;
        public Double bedrooms = 0.0;
        public Double tenure= 0.0;
        public Double mainFuel = 0.0;
        public Double hotWater = 0.0;

        public Double constant = -6.43873151155755;

        public Double sumOfCoefficients= 0.0;
        public Long probability;

        public Long sumCoefficients(){
            sumOfCoefficients += employmentStatus;
            sumOfCoefficients += partnerEmploymentStatus;
            sumOfCoefficients += meansTestedBenefits;
            sumOfCoefficients += disabilityBenefits;
            sumOfCoefficients += paymentMethod;
            sumOfCoefficients += propertyType;
            sumOfCoefficients += pre1964;
            sumOfCoefficients += bedrooms;
            sumOfCoefficients += tenure;
            sumOfCoefficients += mainFuel;
            sumOfCoefficients += hotWater;
            sumOfCoefficients += constant;

            probability = Math.round(100*(Math.exp(sumOfCoefficients)/(1+Math.exp(sumOfCoefficients))));

            return probability;
        }

        public void setCoefficient(String question, Double coefficient){

            switch (question){
                case "employment": this.employmentStatus = coefficient;
                break;

                case "partnerEmployment": this.partnerEmploymentStatus = coefficient;
                break;

                case "meansTestedBenefits": this.meansTestedBenefits = coefficient;
                break;

                case "disability": this.disabilityBenefits = coefficient;
                break;

                case "paymentMethod": this.paymentMethod = coefficient;
                break;

                case "propertyType": this.propertyType = coefficient;
                break;

                case "pre1964": this.pre1964 = coefficient;
                    break;

                case "bedrooms": this.bedrooms = coefficient;
                    break;

                case "tenure": this.tenure = coefficient;
                    break;

                case "fuel": this.mainFuel = coefficient;
                    break;

                case "hotWater": this.hotWater = coefficient;
                    break;
            }


        }
}
