
import java.util.Arrays;
import org.eclipse.january.dataset.Dataset;
import org.eclipse.january.dataset.DatasetFactory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yaya
 */
public class Example {
    
    public static void main(String[] args) {
        Dataset dataset = DatasetFactory.createFromObject(new double[] { 1,2, 3, 4, 5, 6, 7, 8, 9 });
        // Print the output:
        System.out.println("shape of dataset: " + Arrays.toString(dataset.getShape()));
        System.out.println("toString of dataset: " + dataset.toString());
        System.out.println("toString, with data, of dataset: \n" + dataset.toString(true));
    }
    
}
