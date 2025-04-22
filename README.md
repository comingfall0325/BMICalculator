
# 🧮 BMI Calculator - Java Console Program

This is a simple **BMI (Body Mass Index)** calculator written in Java. It takes your height and weight as input, calculates your BMI, and gives you a basic health classification.

## ⚙️ How It Works

1. The program asks you to enter:
   - Your **height** in **meters**
   - Your **weight** in **pounds**
2. It converts the weight to **kilograms**
3. It calculates BMI using the formula:  
   **BMI = weight (kg) / (height * height)**
4. Based on the BMI value, it tells you if you're:
   - Underweight
   - Healthy
   - Overweight
   - Obese

## 📄 File

- `BMICalculator.java`  
  Contains all the logic for reading input, doing calculations, and showing results.

## 🚀 How to Run

1. Make sure Java is installed on your system.
2. Open terminal or command prompt.
3. Navigate to the folder where the file is located.
4. Compile the code:

   ```bash
   javac BMICalculator.java
   ```

5. Run the program:

   ```bash
   java day4.BMICalculator
   ```

## 🧍 Example Usage

```
Enter your height in meter
1.75
Enter your weight in pounds
160
Your BMI is: 24.9
Your are healthy.
```

## 🔍 BMI Categories Used

| BMI Value       | Category      |
|-----------------|---------------|
| ≤ 18.5          | Underweight   |
| 18.6 – 24.9     | Healthy       |
| 25.0 – 29.9     | Overweight    |
| ≥ 30.0          | Obesity       |

## 🛠️ Improvements You Could Try

- Add input validation (e.g., no negative numbers).
- Let users enter weight in kg directly.
- Format BMI to 2 decimal places.
- Loop the program so users can calculate multiple times.
