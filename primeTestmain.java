package com.java.prime;

import java.util.Arrays;

public class primeTestmain {
	
	 public static int primeCount(int arr[], int n)
	    {
	        int max_val = Arrays.stream(arr).max().getAsInt();
	 
	       
	        Boolean[] prime = new Boolean[max_val + 1];
	        for (int i = 0; i < max_val + 1; i++)
	        {
	            prime[i] = true;
	        }
	 
	        // Remaining part of SIEVE
	        prime[0] = false;
	        prime[1] = false;
	        for (int p = 2; p * p <= max_val; p++)
	        {
	 
	            // If prime[p] is not changed, then
	            // it is a prime
	            if (prime[p] == true)
	            {
	 
	                // Update all multiples of p
	                for (int i = p * 2; i <= max_val; i += p)
	                {
	                    prime[i] = false;
	                }
	            }
	        }
	 
	        // Find all primes in arr[]
	        int count = 0;
	        for (int i = 0; i < n; i++)
	        {
	            if (prime[arr[i]])
	            {
	                count++;
	            }
	        }
	 
	        return count;
	    }
	 
	    // Driver code
	    public static void main(String[] args)
	    {
	        int arr[] = {1, 2, 3, 4, 5, 6, 7};
	        int n = arr.length;
	        System.out.println(primeCount(arr, n));
	        
	    }
	}

	
