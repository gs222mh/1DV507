package GS222MH_assign2.EX1;

/**
 * StringSort.java
 * 13 jan 2017
 */

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author jlnmsi
 */
public class CountrySort {

    private static String[] COUNTRIES = {
            "Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra",
            "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina",
            "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan",
            "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium",
            "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia",
            "Bosnia and Herzegovina", "Botswana", "Bouvet Island", "Brazil", "British Indian Ocean Territory",
            "British Virgin Islands", "Brunei", "Bulgaria", "Burkina Faso", "Burundi",
            "Cote d'Ivoire", "Cambodia", "Cameroon", "Canada", "Cape Verde",
            "Cayman Islands", "Central African Republic", "Chad", "Chile", "China",
            "Christmas Island", "Cocos (Keeling) Islands", "Colombia", "Comoros", "Congo",
            "Cook Islands", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic",
            "Democratic Republic of the Congo", "Denmark", "Djibouti", "Dominica", "Dominican Republic",
            "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea",
            "Estonia", "Ethiopia", "Faeroe Islands", "Falkland Islands", "Fiji", "Finland",
            "Former Yugoslav Republic of Macedonia", "France", "French Guiana", "French Polynesia",
            "French Southern Territories", "Gabon", "Georgia", "Germany", "Ghana", "Gibraltar",
            "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guinea", "Guinea-Bissau",
            "Guyana", "Haiti", "Heard Island and McDonald Islands", "Honduras", "Hong Kong", "Hungary",
            "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica",
            "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Kuwait", "Kyrgyzstan", "Laos",
            "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg",
            "Macau", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands",
            "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Micronesia", "Moldova",
            "Monaco", "Mongolia", "Montserrat", "Morocco", "Mozambique", "Myanmar", "Namibia",
            "Nauru", "Nepal", "Netherlands", "Netherlands Antilles", "New Caledonia", "New Zealand",
            "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island", "North Korea", "Northern Marianas",
            "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru",
            "Philippines", "Pitcairn Islands", "Poland", "Portugal", "Puerto Rico", "Qatar",
            "Reunion", "Romania", "Russia", "Rwanda", "Sqo Tome and Principe", "Saint Helena",
            "Saint Kitts and Nevis", "Saint Lucia", "Saint Pierre and Miquelon",
            "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Saudi Arabia", "Senegal",
            "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands",
            "Somalia", "South Africa", "South Georgia and the South Sandwich Islands", "South Korea",
            "Spain", "Sri Lanka", "Sudan", "Suriname", "Svalbard and Jan Mayen", "Swaziland", "Sweden",
            "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "The Bahamas",
            "The Gambia", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey",
            "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Virgin Islands", "Uganda",
            "Ukraine", "United Arab Emirates", "United Kingdom",
            "United States", "United States Minor Outlying Islands", "Uruguay", "Uzbekistan",
            "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Wallis and Futuna", "Western Sahara",
            "Yemen", "Yugoslavia", "Zambia", "Zimbabwe"
    };

    public static void main(String[] args) {
        // Task 1: Print Top 10 list of countries with the longest names
        Comparator<String> longestName = (s1,s2) -> Integer.compare(s2.length(),s1.length());      // Compare the countries to get the longest name
        Arrays.sort(COUNTRIES,longestName);
        System.out.println("\nCountries with longest names");
        for (int i=0; i<10;i++)
            System.out.println("\t"+COUNTRIES[i]);


        // Task 2: Print Top 10 list of countries in reverse alphabetic order
        Comparator<String> reverseAlphabetic = (s1,s2) -> Integer.compare(s2.charAt(0),s1.charAt(0));       // Get the last 10 name (start with z)
        Arrays.sort(COUNTRIES,reverseAlphabetic);
        System.out.println("\nCountries in reverse alphabetic order");
        for (int i=0; i<10;i++)
            System.out.println("\t"+COUNTRIES[i]);

        // Task 3: Print Top 10 list of country names containing most As (either A or a).

        //I make two for loop to get the number of alphabet a in s1 and s2
        //After that I compare and get the result as (countS2 - countS1)
        Comparator<String> countAs = (s1, s2) -> {
            int countS1 = 0;
            int countS2 = 0;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == 'a' || s1.charAt(i) == 'A') {
                    countS1++;
                }
            }
            for (int i = 0; i < s2.length(); i++) {
                if (s2.charAt(i) == 'a' || s2.charAt(i) == 'A') {
                    countS2++;
                }
            }
            return countS2 - countS1;
        };
        Arrays.sort(COUNTRIES, countAs);
        System.out.println("\nCountry names containing most As (either A or a)");
        for (int i = 0; i < 10; i++)
            System.out.println("\t" + COUNTRIES[i]);

    }

}
