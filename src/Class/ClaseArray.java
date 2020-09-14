/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

/**
 *
 * @author Belton
 */
public class ClaseArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;

        Scanner entrada = new Scanner(System.in);
        n = entrada.nextInt();

        LocalDate fecha = LocalDate.now();
        System.out.println("La fecha de codificación es: " + fecha);

        LocalTime hora = LocalTime.now();
        System.out.println("La hora de codificación es: " + hora);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("kk':'mm");
        System.out.println("El momento de codificacion es: " + fecha + "\t" + hora.format(f));

//        System.out.println("El momento de codificacion es: " + fecha + "\t" + hora);
//
//        LocalDateTime ahora = LocalDateTime.of(fecha, hora);
//        System.out.println("Codificamos a la hora" + ahora);
        // Create an instance of SimpleDateFormat used for formatting
        // the string representation of date (day/month/year)
        String pattern = "dd/MM/yyyy";
        DateFormat df = new SimpleDateFormat(pattern);

        // Get the date today using Calendar object.
        Date today = Calendar.getInstance().getTime();

        // Using DateFormat format method we can create a string
        // representation of a date with the defined format.
        String reportDate = df.format(today);

        // Print what date is today!
        System.out.println("Report Date: " + reportDate);

        // Using Java 8.
        // Creates a DateTimeFormatter using the ofPattern() method. Get
        // the current date by calling the .now() method of LocalDate.
        // To convert to string use the format() method of the LocalDate
        // and pass the formatter object as argument.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        LocalDate now = LocalDate.now();
        reportDate = now.format(formatter);
        System.out.println("Report Date: " + reportDate);
        
        Time stf = new Time(n);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String fechaComoCadena = sdf.format(new Date());
        System.out.println(fechaComoCadena);

    }

}
