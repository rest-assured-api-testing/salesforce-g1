package configfile;

import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvEntry;

public class Configuration {
        public static Dotenv dotenv = Dotenv.configure().load();
}
