--
-- PostgreSQL database dump
--

-- Dumped from database version 14.12 (Ubuntu 14.12-0ubuntu0.22.04.1)
-- Dumped by pg_dump version 14.12 (Ubuntu 14.12-0ubuntu0.22.04.1)

-- Started on 2024-07-31 16:56:07 PDT

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 3 (class 2615 OID 2200)
-- Name: public; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA public;


ALTER SCHEMA public OWNER TO postgres;

--
-- TOC entry 3361 (class 0 OID 0)
-- Dependencies: 3
-- Name: SCHEMA public; Type: COMMENT; Schema: -; Owner: postgres
--

COMMENT ON SCHEMA public IS 'standard public schema';


SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 209 (class 1259 OID 16442)
-- Name: dreams; Type: TABLE; Schema: public; Owner: nugentmichael
--

CREATE TABLE public.dreams (
    id integer NOT NULL,
    time_stamp timestamp without time zone DEFAULT CURRENT_TIMESTAMP NOT NULL,
    themes text[],
    archetypes smallint[],
    description text,
    image_name integer,
    interpretation_ai text,
    interpretation_user text
);


ALTER TABLE public.dreams OWNER TO nugentmichael;

--
-- TOC entry 210 (class 1259 OID 16445)
-- Name: dreams_d_id_seq; Type: SEQUENCE; Schema: public; Owner: nugentmichael
--

ALTER TABLE public.dreams ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.dreams_d_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 211 (class 1259 OID 16463)
-- Name: users; Type: TABLE; Schema: public; Owner: nugentmichael
--

CREATE TABLE public.users (
    id integer NOT NULL,
    username character varying
);


ALTER TABLE public.users OWNER TO nugentmichael;

--
-- TOC entry 3353 (class 0 OID 16442)
-- Dependencies: 209
-- Data for Name: dreams; Type: TABLE DATA; Schema: public; Owner: nugentmichael
--

COPY public.dreams (id, time_stamp, themes, archetypes, description, image_name, interpretation_ai, interpretation_user) FROM stdin;
1	2024-07-31 15:34:59.550144	{flying,falling}	{1,2}	Dreamt of flying over mountains and then falling into a river.	1	Possible interpretation of desire for freedom and fear of failure.	User interpretation of feeling trapped in daily routine.
2	2024-07-31 15:34:59.550144	{chase,escape}	{3,4}	Dreamt of being chased by an unknown entity and escaping into a forest.	2	Possible interpretation of running away from responsibilities.	User interpretation of anxiety about upcoming deadlines.
3	2024-07-31 15:34:59.550144	{water,calm}	{5,6}	Dreamt of calmly floating on a vast ocean under the clear sky.	3	Possible interpretation of seeking inner peace and tranquility.	User interpretation of need for relaxation and mental clarity.
\.


--
-- TOC entry 3355 (class 0 OID 16463)
-- Dependencies: 211
-- Data for Name: users; Type: TABLE DATA; Schema: public; Owner: nugentmichael
--

COPY public.users (id, username) FROM stdin;
1	alice
2	bob
3	charlie
\.


--
-- TOC entry 3362 (class 0 OID 0)
-- Dependencies: 210
-- Name: dreams_d_id_seq; Type: SEQUENCE SET; Schema: public; Owner: nugentmichael
--

SELECT pg_catalog.setval('public.dreams_d_id_seq', 3, true);


--
-- TOC entry 3211 (class 2606 OID 16462)
-- Name: dreams dreams_pkey; Type: CONSTRAINT; Schema: public; Owner: nugentmichael
--

ALTER TABLE ONLY public.dreams
    ADD CONSTRAINT dreams_pkey PRIMARY KEY (id);


--
-- TOC entry 3213 (class 2606 OID 16469)
-- Name: users users_pkey; Type: CONSTRAINT; Schema: public; Owner: nugentmichael
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);


-- Completed on 2024-07-31 16:56:07 PDT

--
-- PostgreSQL database dump complete
--

