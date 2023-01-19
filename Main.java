
public class Main {
    public static void main(String[] args) {
        String Pr = "Sun rises in the east every day in the morning at around 6:00 AM";
        String[] Ar=Pr.split(" ");
        int n =Ar.length;

        // Function to perform sorting
        sort(Ar,n);
        // Calling the function to print result
        printArraystring(Ar, n);

    }


    static void sort(String []s, int n)
    {
        for (int i=1 ;i<n; i++)
        {
            String temp = s[i];

            // Insert s[j] at its correct position
            int j = i - 1;
            while (j >= 0 && temp.length() < s[j].length())
            {
                s[j+1] = s[j];
                j--;
            }
            s[j+1] = temp;
        }
    }

    // Function to print the sorted array of string
    static void printArraystring(String[] val, int n)
    {
        for (int i=0; i<n; i++)
            System.out.print(val[i]+" ");
    }

    }

