CREATE TABLE IF NOT EXISTS posts
(
    id    BIGSERIAL PRIMARY KEY ,
    title  VARCHAR(50) NOT NULL ,
    anons VARCHAR(100) NOT NULL ,
    full_text VARCHAR(200)  NOT NULL
);