CREATE TABLE Cocktails
(
    cocktail_id      INT AUTO_INCREMENT PRIMARY KEY,
    name             VARCHAR(255) NOT NULL,
    description      TEXT,
    glass_type       VARCHAR(100),
    preparation_time INT,
    difficulty       ENUM ('Easy', 'Medium', 'Hard'),
    image_url        VARCHAR(255)
);

CREATE TABLE Ingredients
(
    ingredient_id INT AUTO_INCREMENT PRIMARY KEY,
    name          VARCHAR(100) NOT NULL,
    category      ENUM ('Spirit', 'Liqueur', 'Mixer', 'Garnish')
);

CREATE TABLE CocktailIngredients
(
    cocktail_id   INT,
    ingredient_id INT,
    quantity      VARCHAR(50),
    FOREIGN KEY (cocktail_id) REFERENCES Cocktails (cocktail_id),
    FOREIGN KEY (ingredient_id) REFERENCES Ingredients (ingredient_id),
    PRIMARY KEY (cocktail_id, ingredient_id)
);

CREATE TABLE Categories
(
    category_id INT AUTO_INCREMENT PRIMARY KEY,
    name        VARCHAR(100) NOT NULL
);

CREATE TABLE Reviews
(
    review_id   INT AUTO_INCREMENT PRIMARY KEY,
    cocktail_id INT,
    rating      INT CHECK (rating >= 1 AND rating <= 5),
    comment     TEXT,
    user_id     INT,
    FOREIGN KEY (cocktail_id) REFERENCES Cocktails (cocktail_id)
);

CREATE TABLE Users
(
    user_id  INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100) NOT NULL,
    email    VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);