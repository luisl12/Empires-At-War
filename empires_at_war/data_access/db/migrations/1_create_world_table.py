
# packages
from yoyo import step

# Define the migration steps
steps = [
    step(
        "CREATE TABLE world ("
        "id INT AUTO_INCREMENT PRIMARY KEY,"
        "uuid CHAR(36) NOT NULL,"
        "name VARCHAR(10) NOT NULL,"
        "UNIQUE (uuid)"
        ");"
    )
]