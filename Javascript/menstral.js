function getValidDate(year, month, day) {
  const date = new Date(year, month - 1, day);
  return date.getFullYear() === year &&
         date.getMonth() === month - 1 &&
         date.getDate() === day;

}

function cycleStart(year, month, day) {
  return `Your cycle starts on ${new Date(year, month - 1, day).toDateString()}`;
}

function flowDate(year, month, day) {
  const start = new Date(year, month - 1, day);
  const stop = new Date(start);
  stop.setDate(start.getDate() + 5);
  return `Your flow starts on ${start.toDateString()} and ends on ${stop.toDateString()}`;
}

function cycleStops(year, month, day, cycleLength) {
  const end = new Date(year, month - 1, day);
  end.setDate(end.getDate() + cycleLength);
  return `Your cycle ends on ${end.toDateString()}`;
}

function calculateOvulation(year, month, day, cycleLength) {
  const start = new Date(year, month - 1, day);
  const ovulation = new Date(start);
  ovulation.setDate(start.getDate() + (cycleLength - 14));
  return `Your ovulation date is ${ovulation.toDateString()}`;
}

function calculateFertileWindow(year, month, day, cycleLength) {
  const start = new Date(year, month - 1, day);
  const fertileStart = new Date(start);
  fertileStart.setDate(start.getDate() + (cycleLength - 21));
  const fertileEnd = new Date(start);
  fertileEnd.setDate(start.getDate() + (cycleLength - 12));
  return `Your fertile window is from ${fertileStart.toDateString()} to ${fertileEnd.toDateString()}`;
}

function calculateSafePeriod(year, month, day, cycleLength) {
  const fertileStart = new Date(year, month - 1, day);
  fertileStart.setDate(fertileStart.getDate() + (cycleLength - 21));
  const fertileEnd = new Date(year, month - 1, day);
  fertileEnd.setDate(fertileEnd.getDate() + (cycleLength - 12));
  return `Safe period is all days except ${fertileStart.toDateString()} to ${fertileEnd.toDateString()}`;
}

// Main execution
(function() {
  try {
    const year = parseInt(prompt("Enter the year (e.g. 2025):"));
    const month = parseInt(prompt("Enter the month (1 - 12):"));
    const day = parseInt(prompt("Enter the day (1 - 31):"));
    const cycleLength = parseInt(prompt("Enter your cycle length (e.g. 28):"));

    if (!getValidDate(year, month, day)) {
     console.log("Invalid date. Please try again.");
      return;
    }

    let result = "";
    result += cycleStart(year, month, day) + "\n";
    result += flowDate(year, month, day) + "\n";
    result += cycleStops(year, month, day, cycleLength) + "\n";
    result += calculateOvulation(year, month, day, cycleLength) + "\n";
    result += calculateFertileWindow(year, month, day, cycleLength) + "\n";
    result += calculateSafePeriod(year, month, day, cycleLength);

    console.log("Result:\n" + result);

  } catch (error) {
   console.log("Invalid input. Please enter valid numbers only.");
  }
})();