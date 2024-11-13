create table message (
                         id bigserial primary key,
                         data varchar(1024)
);
CREATE TABLE IF NOT EXISTS invoices (
                                        id BIGINT PRIMARY KEY,
                                        ticket_id BIGINT NOT NULL,
                                        total_amount DECIMAL(15, 2) NOT NULL,
                                        due_date DATE NOT NULL,
                                        paid BOOLEAN NOT NULL
                                        );
CREATE TABLE IF NOT EXISTS passengers (
                                        id BIGINT PRIMARY KEY,
                                        first_name VARCHAR(255) NOT NULL,
                                        last_name VARCHAR(255) NOT NULL,
                                        email VARCHAR(255) UNIQUE,
                                        phone_number VARCHAR(20)
                                        );
CREATE TABLE IF NOT EXISTS trains (
                                        id BIGINT PRIMARY KEY,
                                        name VARCHAR(255) NOT NULL,
                                        departure_station VARCHAR(255) NOT NULL,
                                        arrival_station VARCHAR(255) NOT NULL,
                                        departure_time TIMESTAMP NOT NULL,
                                        arrival_time TIMESTAMP NOT NULL,
                                        available_seats INT NOT NULL
                                        );
CREATE TABLE IF NOT EXISTS tickets (
                                        id BIGINT PRIMARY KEY,
                                        passenger_id BIGINT NOT NULL,
                                        train_id BIGINT NOT NULL,
                                        price DECIMAL(15, 2) NOT NULL,
                                        issue_date TIMESTAMP NOT NULL,
                                        FOREIGN KEY (passenger_id) REFERENCES passengers(id),
                                        FOREIGN KEY (train_id) REFERENCES trains(id)
                                        );
