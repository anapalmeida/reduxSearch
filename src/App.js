import { Provider } from "react-redux";
import Routes from "./routes";

import search from "./store";

function App() {
  return (
    <Provider store={search}>
      <Routes />
    </Provider>
  );
}

export default App;
