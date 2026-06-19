Feature: I want to create a scenario outline where datatable is also being used
Background: Given user is at the base page 


Scenario Outline: Using the data table & background in this scenario

When user clicks on "add" button

And provides the static data as below used map here

| name | roll no | division |
| omkar | 18 | a |

And clicks on save button 
And provides the grade obtained for the subject "<English>" , "<Marathi>" in standard respective <standard>
And clicks on save button 
Then sutudents marks get entered

Examples:
|standard |English | Marathi |
|3 | A | A+ |
|4 | B | C+ |





