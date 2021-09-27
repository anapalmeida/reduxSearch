import { createStore } from "redux";
import searchReducer from "./searchReducer";

const search = createStore(searchReducer);

export default search;
