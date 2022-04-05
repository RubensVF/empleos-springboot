CREATE TABLE job(id INT AUTO_INCREMENT PRIMARY KEY,
                name VARCHAR(50),
                brand VARCHAR(50),
                description TEXT,
                date DATE,
                salary DOUBLE,
                status INT,
                image VARCHAR(50),
                details TEXT,
                idCategory INT UNIQUE FOREGIN KEY REFERENCES category(id)
                );

CREATE TABLE category(id INT AUTO_INCREMENT PRIMARY KEY,
                    category VARCHAR(50),
                    description TEXT
                    );
