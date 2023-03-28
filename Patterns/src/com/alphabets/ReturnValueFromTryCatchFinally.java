package com.alphabets;

public class ReturnValueFromTryCatchFinally
{
    public static void main(String[] args)
    {
        try
        {
            return;
        }
        catch (Exception e)
        {
            return;
        }
        finally
        {
            return;
        }
 
         //Compile Time Error : Unreachable Code
    }
}