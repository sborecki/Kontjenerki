CREATE TABLE IF NOT EXISTS animal (
  id SERIAL PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  priority INTEGER NOT NULL,
  remarks VARCHAR(256)
)