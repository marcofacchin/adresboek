package be.poverello.adresboek;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository
public class PersoonRepository {

    private final JdbcClient jdbcClient;

    public PersoonRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    long findAantal() {
        var sql = """
                select count(*) as aantalPersonen
                from persoon
                """;
        return jdbcClient.sql(sql)
                .query(Long.class)
                .single();
    }

}
