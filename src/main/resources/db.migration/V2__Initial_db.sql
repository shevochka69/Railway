INSERT INTO passengers (id, first_name, last_name, email, phone_number)
VALUES
    (1, 'John', 'Doe', 'johndoe@example.com', '123-456-7890'),
    (2, 'Jane', 'Smith', 'janesmith@example.com', '098-765-4321'),
    (3, 'Robert', 'Brown', 'robertbrown@example.com', '321-654-0987'),
    (4, 'Emily', 'Clark', 'emilyclark@example.com', '456-789-0123'),
    (5, 'Michael', 'Johnson', 'michaeljohnson@example.com', '654-321-0987'),
    (6, 'Sophia', 'Martinez', 'sophiamartinez@example.com', '789-012-3456'),
    (7, 'Daniel', 'Lee', 'daniellee@example.com', '987-654-3210');
INSERT INTO trains (id, name, departure_station, arrival_station, departure_time, arrival_time, available_seats)
VALUES
    (1, 'Express 101', 'Kyiv', 'Lviv', '2024-11-10 08:00:00', '2024-11-10 12:30:00', 100),
    (2, 'Intercity 200', 'Odesa', 'Kyiv', '2024-11-11 14:00:00', '2024-11-11 19:30:00', 150),
    (3, 'Fast Train 303', 'Kharkiv', 'Dnipro', '2024-11-12 06:00:00', '2024-11-12 09:00:00', 80),
    (4, 'Night Express 404', 'Lviv', 'Uzhhorod', '2024-11-13 22:00:00', '2024-11-14 04:00:00', 50),
    (5, 'Regional 505', 'Poltava', 'Sumy', '2024-11-14 10:00:00', '2024-11-14 14:00:00', 70),
    (6, 'Suburban 606', 'Chernihiv', 'Kyiv', '2024-11-15 07:30:00', '2024-11-15 09:00:00', 200),
    (7, 'Express 707', 'Kyiv', 'Odesa', '2024-11-16 09:00:00', '2024-11-16 13:30:00', 120);
INSERT INTO tickets (id, passenger_id, train_id, price, issue_date)
VALUES
    (1, 1, 1, 250.00, '2024-11-05 09:00:00'),
    (2, 2, 2, 300.00, '2024-11-06 10:00:00'),
    (3, 3, 3, 180.00, '2024-11-06 12:00:00'),
    (4, 4, 4, 220.00, '2024-11-07 08:00:00'),
    (5, 5, 5, 150.00, '2024-11-07 15:00:00'),
    (6, 6, 6, 75.00, '2024-11-08 07:00:00'),
    (7, 7, 7, 280.00, '2024-11-08 16:00:00');
INSERT INTO invoices (id, ticket_id, total_amount, due_date, paid)
VALUES
    (1, 1, 250.00, '2024-11-15', FALSE),
    (2, 2, 300.00, '2024-11-16', TRUE),
    (3, 3, 180.00, '2024-11-17', FALSE),
    (4, 4, 220.00, '2024-11-18', TRUE),
    (5, 5, 150.00, '2024-11-19', FALSE),
    (6, 6, 75.00, '2024-11-20', TRUE),
    (7, 7, 280.00, '2024-11-21', FALSE);
INSERT INTO message (data)
VALUES
    ('Welcome to the ticket booking system'),
    ('Your invoice is due soon.'),
    ('Ticket successfully booked!'),
    ('Train is departing soon.'),
    ('Thank you for using our service!'),
    ('Check your email for ticket details.'),
    ('Payment received. Enjoy your trip!');
