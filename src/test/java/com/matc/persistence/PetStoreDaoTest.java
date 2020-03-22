package com.matc.persistence;

import org.junit.Test;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetStoreDaoTest {

    @Test
    public void getPetSuccess() {
        PetStoreDao dao = new PetStoreDao();
        assertEquals("doggie", dao.getPet().getName());
    }
}