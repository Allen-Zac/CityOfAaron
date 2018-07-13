/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import cityofaaron.CityOfAaron;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Ginger
 */
public abstract class ViewBase implements View {
    
    private String message;
    protected final BufferedReader keyboard = CityOfAaron.getInFile();
    protected final PrintWriter console = CityOfAaron.getOutFile();
    
    public ViewBase(){
        
    }
    
    protected abstract String getMessage();
    
    protected abstract String[] getInputs();
    
    public abstract boolean doAction(String[] inputs);
    
    @Override
    public void displayView(){
        
        boolean keepGoing = true;
        
        while(keepGoing == true){
            
            String message = getMessage();
            if (message != null) {
                this.console.println(getMessage());
            }
            
            String[] inputs = getInputs();
            keepGoing = doAction(inputs);
        }
    }
    
    protected String getUserInput(String prompt, boolean allowEmpty){
        
        boolean inputReceived = false;
        String input = null;
        try {
            while(inputReceived == false){
            
                this.console.println(prompt);

                // Make sure we avoid a null-pointer error.
                if (input == null){
                    input = "";
                }
                
                input = this.keyboard.readLine();

                // Trim any trailing whitespace, including the carriage return.
                input = input.trim();

                if (input.equals("") == false || allowEmpty == true){
                    inputReceived = true;
                }
            break;
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error reading input.");        }
        
        
        return input;
    }
    
    protected String getUserInput(String prompt){
        return getUserInput(prompt, false);
    }
    
    protected static void pause(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        }
        catch (InterruptedException exception) {
            //do nothing
        }
    }
   
}
