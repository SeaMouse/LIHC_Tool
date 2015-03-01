package clifford.alan.lihctool;

/**
 * Created by Alan Clifford on 28/02/2015.
 */
public class Coefficients {

    // Employment Status
    public Double employmentStatus_employed = 0.0;
    public Double employmentStatus_unemployed = 0.651095064468712;
    public Double employmentStatus_inactive = 0.651095064468712;
    public Double employmentStatus_retired = 0.331703123627037;

    // Partner Employment Status
    public Double partnerEmploymentStatus_employed= 0.0;
    public Double partnerEmploymentStatus_unemployed = 0.769117415278324;
    public Double partnerEmploymentStatus_inactive = 0.769117415278324;
    public Double partnerEmploymentStatus_retired = 0.634340362689448;
    public Double partnerEmploymentStatus_none = 0.423519372886621;

    // Means tested benefits
    public Double meansTestedBenefits_no = 0.0;
    public Double meansTestedBenefits_yes = 1.13424377717595;

    // Disability benefits
    public Double disabilityBenefits_no = 0.0;
    public Double disabilityBenefits_yes = -0.888002228593725;

    // Payment methods
    public Double paymentMethod_direct_debit = 0.0;
    public Double paymentMethod_pre_payment =0.71500905256504;
    public Double paymentMethod_standard_credit =0.606280079174281;

    // Property types
    public Double propertyType_flat = 0.0;
    public Double propertyType_terrace =0.874952024057189;
    public Double propertyType_semi = 1.13127381004292;
    public Double propertyType_detached = 1.15732799124851;
    public Double propertyType_bungalow = 1.15732799124851;

    // Property age
    public Double pre1964_no =0.0;
    public Double pre1964_yes =1.10407580750794;

    // No. of bedrooms
    public Double bedrooms_one = 0.0;
    public Double bedrooms_two =0.418505030181664;
    public Double bedrooms_three = 0.847792615525525;
    public Double bedrooms_four = 1.19551492065907;
    public Double bedrooms_five = 1.41885280750625;

    // Tenure
    public Double tenure_social = 0.0;
    public Double tenure_owner = 0.445069574349464;
    public Double tenure_prs = 1.12509742631037;

    // Main fuel
    public Double mainFuel_gas = 0.0;
    public Double mainFuel_electricity = 0.587799655901285;
    public Double mainFuel_other = 0.74954465150606;

    // Hot water
    public Double hotWater_yes = 0.0;
    public Double hotWater_no = 0.885994519787023;

}
