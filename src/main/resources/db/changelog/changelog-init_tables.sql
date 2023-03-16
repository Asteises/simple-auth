CREATE TABLE roles
(
    id        INTEGER PRIMARY KEY,
    role_name VARCHAR(100) NOT NULL
);

CREATE TABLE users
(
    id         UUID PRIMARY KEY,
    email      VARCHAR(100) NOT NULL UNIQUE,
    password   VARCHAR(255) NOT NULL,
    first_name VARCHAR(100),
    last_name  VARCHAR(100)
);

CREATE TABLE users_roles
(
    user_id UUID    NOT NULL,
    role_id INTEGER NOT NULL,
    CONSTRAINT pk_users_roles PRIMARY KEY (user_id, role_id),
    FOREIGN KEY (user_id) REFERENCES users (id),
    FOREIGN KEY (role_id) REFERENCES roles (id)
);