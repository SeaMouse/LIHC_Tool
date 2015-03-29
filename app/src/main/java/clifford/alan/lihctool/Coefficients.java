package clifford.alan.lihctool;

/**
 * Created by Alan Clifford on 28/02/2015.
 */
public class Coefficients {

    // Employment Status
    public Double employmentStatus_employed = 0.0;
    public Double employmentStatus_unemployed = 0.6511;
    public Double employmentStatus_inactive = 0.6511;
    public Double employmentStatus_retired = -0.3317;

    // Partner Employment Status
    public Double partnerEmploymentStatus_employed= 0.0;
    public Double partnerEmploymentStatus_unemployed = 0.7691;
    public Double partnerEmploymentStatus_inactive = 0.7691;
    public Double partnerEmploymentStatus_retired = 0.6343;
    public Double partnerEmploymentStatus_none = 0.4235;

    // Means tested benefits
    public Double meansTestedBenefits_no = 0.0;
    public Double meansTestedBenefits_yes = 1.1342;

    // Disability benefits
    public Double disabilityBenefits_no = 0.0;
    public Double disabilityBenefits_yes = -0.8880;

    // Payment methods
    public Double paymentMethod_direct_debit = 0.0;
    public Double paymentMethod_pre_payment =0.7150;
    public Double paymentMethod_standard_credit =0.6063;

    // Property types
    public Double propertyType_flat = 0.0;
    public Double propertyType_terrace =0.8750;
    public Double propertyType_semi = 1.1313;
    public Double propertyType_detached = 1.1573;
    public Double propertyType_bungalow = 1.1573;

    // Property age
    public Double pre1964_no =0.0;
    public Double pre1964_yes =1.1041;

    // No. of bedrooms
    public Double bedrooms_one = 0.0;
    public Double bedrooms_two =0.4185;
    public Double bedrooms_three = 0.8478;
    public Double bedrooms_four = 1.1955;
    public Double bedrooms_five = 1.4189;

    // Tenure
    public Double tenure_social = 0.0;
    public Double tenure_owner = 0.4451;
    public Double tenure_prs = 1.1251;

    // Main fuel
    public Double mainFuel_gas = 0.0;
    public Double mainFuel_electricity = 0.5878;
    public Double mainFuel_other = 0.7495;

    // Hot water
    public Double hotWater_yes = 0.0;
    public Double hotWater_no = 0.8860;

}
