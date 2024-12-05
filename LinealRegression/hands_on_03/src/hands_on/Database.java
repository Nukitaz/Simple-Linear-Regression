package hands_on;

public class Database {

    double[] sales = {651, 762, 856, 1063, 1190, 1298, 1421, 1440, 1518};
    double[] advirtising = {23, 26, 30, 34, 43, 48, 52, 57, 58};


    public String dataBaseMetodo (double x) {
        int numero_total_datos = 9;
        double suma_x=0, suma_y=0, suma_x_y=0, sum_x_quad=0, b0=0, b1=0, y=0;
        String suma_xtext, suma_ytext, suma_x_ytext, sum_x_quadtext, b0text, b1text, ytext, resultadotext;
        //x = advertising
        //y = sales

        //suma x
        for (int i=0; i<9;i++){
            suma_x  += advirtising[i];
        }
        
        //suma y
        for (int i=0; i<9;i++){
            suma_y  += sales[i];
        }

        //suma x,y
        for (int i=0; i<9;i++){
            suma_x_y  += advirtising[i] * sales[i];
        }

        //sumxquad
        for (int i=0; i<9;i++){
            sum_x_quad += advirtising[i] * advirtising[i];
        }
        
        //formulas

        b1 = (numero_total_datos * suma_x_y - suma_x * suma_y) / (numero_total_datos * sum_x_quad - (Math.pow(suma_x, 2)));
        b0 = (suma_y - (b1 * suma_x)) / (numero_total_datos);

        y = b0 + (b1*x);

        //return final
        suma_xtext = Double.toString(suma_x);
        suma_ytext = Double.toString(suma_y);
        suma_x_ytext = Double.toString(suma_x_y);
        sum_x_quadtext = Double.toString(sum_x_quad);
        b0text = Double.toString(b0);
        b1text = Double.toString(b1);
        ytext = Double.toString(y);

        resultadotext = "-Hands on 3-\n\n";
        resultadotext += "sum y: " + suma_ytext + "\n";
        resultadotext += "sum x: " + suma_xtext + "\n";
        resultadotext += "sum xy: " + suma_x_ytext + "\n";
        resultadotext += "sum_x_quad: " + sum_x_quadtext + "\n\n";
        resultadotext += "b0: " + b0text + "\n";
        resultadotext += "b1: " + b1text + "\n";
        resultadotext += "y: " + ytext + "\n";

        return resultadotext;
    }
}