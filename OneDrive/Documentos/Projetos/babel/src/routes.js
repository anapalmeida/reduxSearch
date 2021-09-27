import { BrowserRouter, Route } from "react-router-dom";

import Main from "./Main";

function Routes() {
  return (
    <BrowserRouter>
      <Route path="/" component={Main} exact />
    </BrowserRouter>
  );
}

export default Routes;
