
Date Time Transformation:
In this project I need to write a program to transform the
given datetime string to different formats. The initial requirement is to transform it to any
different time zone. 

First of all I need to transform a given data time to different time zone ,

For example, If the given date time is "03/15/2022 10:23:45 pm",So I defined the transformed format as "MM/dd/yyyy hh:mm:ss a"
Fortunately, I can import the library that comes with java to convert the time zone

The output shown below:
![Y6{88RV%YO0FMJ0UC82}MOU](https://user-images.githubusercontent.com/62952998/167272228-d2dbfb48-9439-4a8c-ac2c-4b7b25625e7e.png)

Next, The second requirement ask me to add a daylight-saving mode which
allows adding the daylight-saving starting date time and daylight-saving ending date,I select the American daylight-saving starting date and ending date

Fortunately, the library that comes with Java records the start and end times of daylight saving time in different time zones, so I only need to call the existing data in the library, and I don't need to iterate to calculate the start of daylight saving time for each year. and end time.
Below are the start and end times of daylight saving time over 10 years.

![3D3@85{)N2WS}WD5`TQEEG0](https://user-images.githubusercontent.com/62952998/167272495-0dcf87cf-fd72-4f8e-a01a-db2a37e7604b.png)


Finally，The third requirement change is to ask me to support the day of the week in
the date time representation. So 03/09/2021 8:00 would become 03/09/2021 Tuesday 8:00.I only need to transform the format "MM/dd/yyyy hh:mm:ss a" I metioned above to 
 "MM/dd/yyyy hh:mm:ss a EEEE",I can meet this requirement.
 
 So far I have met the three requirements that need to be fulfilled.
 
 Everything taken into my consideration，
 ![ND9EZ$N%LLJ5TD E@)LR8_3](https://user-images.githubusercontent.com/62952998/167272752-381ff527-8d39-424d-ba74-16a3cb24be3d.png)


| First Header  | Second Header |
| ------------- | ------------- |
| Content Cell  | Content Cell  |
| Content Cell  | Content Cell  |
