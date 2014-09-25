package discount.strategy;

/**
 * The concrete super class of all employee types. What's wrong with this class?
 * Find and fix all encapsulation, DIP and best practice problems learned
 * so far.
 *
 * @author your name goes here
 */
public interface Employee {
    // You gotta question if these are appropriate for ALL employees?
//    private double hourlyRate;
//    private double totalHrsForYear;
//   

    /**
     * Returns annual wages for hourly workers. Is this polymorphic?
     * Could it be? Does it belong here?
     *
     * @return annual wages for hourly workers using the formula
     * annualWages = hourlyRate * totalHrsForYear
     */
     // you do not need the "abstract" keyword because it is implicit
	// just implement this interface and create your own derived class implementation
	//public abstract double getTip();
    
       public abstract double getAnnualWages(); 
//    {
//        return hourlyRate * totalHrsForYear;
//    }

  }

   
    
