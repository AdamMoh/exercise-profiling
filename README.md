# Reflection Exercise Profiling

1. Jmeter would be useful if you want to test the performance of the application with multiple threads, while Intellij profiler is useful when developing the app to see what is taking the most time and then optimize it.
2. The profiling process is very helpful to identify which programs take to much time to run, so we can optimize them precisely.
3. Yes, Intellij profiler is effective to identify the performance of the application, it shows the time taken by each method and the number of times it is called.
4. The main challenge when using profiler is to understand the data it shows, and to know what to do with it.
5. The benefit that i got from using Intellij Profiler to profiling my application code is that i can see which methods take the most time and then optimize them.
6. Intellij profiler runs within the development environment, which might differ significantly from the production environment where JMeter tests are conducted. Variations in HW/SW, network latency, etc might influence performance in each environment.
7. To do this optimization and ensure the changes did not affect the application functionality, I used JPQL and collection to optimize the code. To ensure the changes do not affect the application's functionality, I change the essential part of the code that takes the most time, and then when I run the application, it still works as expected.


## Screenshots
`/all-student-name`
<img width="960" alt="all_student_name" src="https://github.com/AdamMoh/exercise-profiling/assets/56309298/e42d74dc-d520-40ef-81da-69546c81e087">

<img width="960" alt="all_student_name_jtl" src="https://github.com/AdamMoh/exercise-profiling/assets/56309298/6fa5614f-06e2-49d3-89bb-919de2758ecd">


Optimized:
<img width="960" alt="all_student_name_optimized" src="https://github.com/AdamMoh/exercise-profiling/assets/56309298/7916f977-26da-486c-835f-aaff8b5b9c87">
Based on sample time, it already optimized more than 20%

`/highest-gpa`
<img width="960" alt="highest_gpa" src="https://github.com/AdamMoh/exercise-profiling/assets/56309298/1ac08dcb-87ff-4bde-a693-38352449d10f">

<img width="960" alt="highest_gpa_jtl" src="https://github.com/AdamMoh/exercise-profiling/assets/56309298/457c6299-4161-47ae-a121-db1f4b8861ae">

Optimized:
<img width="960" alt="highest_gpa_optimized" src="https://github.com/AdamMoh/exercise-profiling/assets/56309298/1304b1f5-6f8b-44a3-95af-8d620dec2854">
Based on sample time, the optimized one not significantly improve, but it ran faster than before
