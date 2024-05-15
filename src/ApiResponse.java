public record ApiResponse
    (String result,
    String documentation,
   String terms_of_use,
    int time_last_update_unix,
    String time_last_update_utc,
   int time_next_update_unix,
    String time_next_update_utc,
    String base_code,
    String target_code,
    float conversion_rate,
    float conversion_result) {
    @Override
    public String toString() {
        return "El monto ingresado de " + this.base_code + " equivale a " + this.conversion_result + " " + this.target_code;
    }
}
