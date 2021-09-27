const INITIAL_STATE = {
  itemSearchIsFilled: 0,
  searchItem: "",
};

function searchReducer(state = INITIAL_STATE, action) {
  switch (action.type) {
    case "SEARCH_IS_MADE":
      return { ...state, itemSearchIsFilled: 1, searchItem: action.searchItem };
    default:
      return state;
  }
}

export default searchReducer;
