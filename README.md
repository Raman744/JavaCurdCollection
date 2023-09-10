## Database table 
CREATE TABLE persondata(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    country VARCHAR(255),
    phoneNumber VARCHAR(20),
    joinDate DATE,
    companyName VARCHAR(255),
    password VARCHAR(255) NOT NULL,
    updateJoinDate DATE
);

  ResultSet generatedKeys = ps.getGeneratedKeys();
            if (generatedKeys.next()) {
                int generatedId = generatedKeys.getInt(1);
                // Create a PersonData object with the inserted data and add it to the list
                PersonData insertedData = new PersonData(generatedId, name, email, country, phone, joinDate, companyName, password, updateJoin);
                insertedRecords.add(insertedData);
            }
        } else {
            System.out.println("Failed to insert record.");
        }
