### Password Manager App - Getting Started Guide

Hey there! Ready to get started with the Password Manager App? Follow these simple steps:

### Step 1: Install XAMPP (If not already installed)

Make sure you have XAMPP installed on your machine. If not, download and install it from [XAMPP Download Page](https://www.apachefriends.org/index.html).

### Step 2: Start XAMPP

Open the XAMPP Control Panel and start both the Apache and MySQL services.

### Step 3: Import the Database

1. Open your web browser and go to `http://localhost/phpmyadmin/`.
2. Log in using the default credentials (username: `root` and no password). If you set a password during XAMPP installation, use that.
3. Click on "Databases" and create a new database. You can name it something like `securepass_db`.
4. Select the newly created database and go to the "Import" tab.
5. Click "Choose File," select `securepass_db.sql` from your `dist` folder, and hit "Go."

### Step 4: Run the Password Manager App

1. Navigate to your `dist` folder where you find `PasswordManagerApp.jar`.
2. Double-click on `PasswordManagerApp.jar` to run the Password Manager App.

### Step 5: Update Database Connection Settings

1. If prompted, enter the database connection details.
   - Database Name: `securepass_db` (or the name you chose)
   - Username: `root` (or your MySQL username)
   - Password: Use the password you set during XAMPP installation.

### Step 6: Explore the Password Manager App

You're all set! Explore the Password Manager App, add your passwords, and enjoy secure password management.

### Additional Notes:

- Make sure XAMPP services are running when using the Password Manager App.

Happy secure password managing! 🌟